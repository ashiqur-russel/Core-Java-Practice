package codegame;

import java.util.Scanner;
import java.util.Stack;

class node {
    int x;
    int y;
    int Distance;
    String res;

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MountainMoleHill {
    private static int Check(int x, int y, char[][] maze, boolean[][] vis) {
        if (!(x >= 0 && y >= 0 && x < maze.length && y < maze[0].length) || maze[x][y] == '.')
            return 1;
        if (vis[x][y] == false && !(maze[x][y] == '-' || maze[x][y] == '|' ||
                maze[x][y] == '+')) {
            return 2;
        }
        return 3;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char[][] maze = new char[16][16];
        for (int i = 0; i < 16; i++) {
            String line = in.nextLine();
            for (int j = 0; j < 16; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
        // System.out.println();
        int ans = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Boolean fg = true;
                if (maze[i][j] == 'o') {

                    node src = new node(0, 0);
                    src.x = i;
                    src.y = j;

                    Stack<node> st = new Stack<>();
                    st.push(new node(src.x, src.y));

                    boolean[][] vis = new boolean[maze.length][maze[0].length];
                    vis[src.x][src.y] = true;

                    while (st.isEmpty() == false) {
                        node p = st.pop();
                        int z1 = Check(p.x - 1, p.y, maze, vis);
                        if (z1 == 1) {
                            fg = false;
                            break;
                        } else if (z1 == 2) {
                            st.push(new node(p.x - 1, p.y));
                            vis[p.x - 1][p.y] = true;

                        }
                        int z2 = Check(p.x + 1, p.y, maze, vis);
                        if (z2 == 1) {
                            fg = false;
                            break;
                        } else if (z2 == 2) {
                            st.push(new node(p.x + 1, p.y));
                            vis[p.x + 1][p.y] = true;
                        }
                        int z3 = Check(p.x, p.y - 1, maze, vis);
                        if (z3 == 1) {
                            fg = false;
                            break;
                        } else if (z3 == 2) {
                            st.push(new node(p.x, p.y - 1));
                            vis[p.x][p.y - 1] = true;
                        }
                        int z4 = Check(p.x, p.y + 1, maze, vis);
                        if (z4 == 1) {
                            fg = false;
                            break;
                        } else if (z4 == 2) {
                            st.push(new node(p.x, p.y + 1));
                            vis[p.x][p.y + 1] = true;
                        }
                    }
                    if (fg == true) {
                        ans++;
                        // System.out.print('#');
                    } //else
                    //System.out.print(maze[i][j]);
                } //else
                // System.out.print(maze[i][j]);
            }
            //  System.out.println();
        }
        System.out.println(ans);
    }
}
