package wanghaixu;
public class Person {
    private int id;
    private Person left;
    private  Person right;

    public int getId() {
        return id;
    }

    public Person getRight() {
        return right;
    }

    public Person getLeft() {
        return left;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLeft(Person left) {
        this.left = left;
    }

    public void setRight(Person right) {
        this.right = right;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "IDÊÇ" + this.id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Person(){}
    public Person(int id){
        this.id = id;
    }


}