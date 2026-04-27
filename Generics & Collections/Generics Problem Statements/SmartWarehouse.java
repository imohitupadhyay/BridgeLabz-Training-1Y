abstract class WarehouseItem { }
class Electronics extends WarehouseItem { }

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void displayAll(List<? extends WarehouseItem> list) { // Wildcard method [cite: 427]
        for (WarehouseItem item : list) System.out.println(item);
    }
}