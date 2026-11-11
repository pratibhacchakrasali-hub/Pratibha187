class Household {
    String name;
    String phone;
    
    Household(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    void display(){
        System.out.println("Household name"+" "+ name);
        System.out.println("household phone"+ phone);
    }

    public static void main(String args[]){
        Household h1 = new Household("Pratibha","1234567890");
        h1.display();
    }
}
