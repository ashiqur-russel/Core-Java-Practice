package list;

public class List {

    private Node root;

    public void add(Record record) {

        if (root == null) {
            root = new Node(record);
        } else {

            Node node = root;

            while (node.next != null) {

                if (node.record.getName().equals(record.getName())) {
                    node.record = record;
                    return;
                }
                node = node.next;
            }

            node.next = new Node(record);
        }
    }

    public void merge(List newList) {

        if (root == null) {
            root = newList.root;
            return;
        }
        if (newList == null || newList.root == null) {
            return;
        }

        Node newNode = newList.root;
        Node existingNode = root;

        while (newNode.next != null) {

            boolean recordUpdated = false;
            while (existingNode.next != null) {

                if (newNode.record.getName().equals(existingNode.record.getName())) {
                    existingNode.record = newNode.record;
                    recordUpdated = true;
                    break;
                }
            }

            if (!recordUpdated) {
                existingNode.next = newNode;
            }
            newNode = newNode.next;
            existingNode = root;
        }
    }

    public List splitByType(ProductType productType) {

        List productList = new List();

        while (root != null && root.record.getProductType() == productType) {
            productList.add(root.record);
            root = root.next;
        }

        Node node = root;

        while (node != null && node.next != null) {

            if (node.next.record.getProductType() == productType) {
                productList.add(node.next.record);
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return productList;
    }

    public double calculateTotal() {

        if (root == null) {
            return 0;
        }

        double total = 0;
        Node node = root;

        while (node.next != null) {
            Record record = node.record;
            total = total + (record.getAmount() * record.getPrice());
            node = node.next;
        }
        return total;
    }

    private static class Node {

        private Record record;
        private Node next;

        public Node(Record record) {
            this.record = record;
            next = null;
        }
    }
}
