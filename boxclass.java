class Box {
    private double width;
    private double height;
    private double depth;
    private String[] items;
    private int numItems;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.items = new String[10];
        this.numItems = 0; 
    }
        void setAge(int inputwidth) {
            width = inputwidth;
    
        }
        double getwidth() {
            return width;
        }
        void setheight(double inputheight) {
            height = inputheight;
    
        }
        double gethieght() {
            return height;
        }
        void setdepth(double inputdepth) {
            depth = inputdepth;
    
        }
        double getdepth() {
            return depth;
        } {

        this.items = new String[10];
        this.numItems = 0; 
    }
       double volume() {
            return width * height * depth;
        }

        void addItem(String item) {
            if (numItems < 10) {
                items[numItems] = item;
                numItems++;
            } else {
                System.out.println("No More Entries!");
            }
        }
    
        void removeItem(String item) {
            for (int i = 0; i < numItems; i++) {
                if (items[i].equals(item)) {
                    for (int r = i; r < numItems - 1; r++) {
                        items[r] = items[r++];
                    }
                    items[numItems - 1] = null;
                    numItems--;
                    break;
                }
            }
        }
    
        void printItems() {
            for (int i = 0; i < numItems; i++) {
                System.out.println(items[i]);
            }
        }
    }