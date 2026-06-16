public class Container {
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > 100) {
                this.amount = 100;
            }
        }
    }
    
    public int remove(int amount) {
        if (amount >= this.amount) {
            int temp = this.amount;
            this.amount = 0;
            return temp;
        } else {
            this.amount -= amount;
        }
        
        return amount;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public static void print(String name, int amount) {
        System.out.println(name + ": " + amount + "/100");
    }
}

