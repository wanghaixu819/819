package wanghaixu;
public class PersonCircle {
    private  int count;
    private  Person first;
    private  Person last;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Person getFirst() {
        return first;
    }

    public Person getLast() {
        return last;
    }

    public PersonCircle(int count){
        for (int i = 0;i < count;i++){
            Person p = new Person(i);
            add(p);
        }
    }

    public void add(Person p){
        if(this.count == 0){
            this.first = p;
            this.last = p;
            p.setLeft(p);
            p.setRight(p);
        }else {
            this.last.setRight(p);
            p.setLeft(this.last);
            p.setRight(this.first);
            this.first.setLeft(p);
            this.last=p;
        }
        this.count ++;
    }

    public void delete(Person p){
        if(p.equals(this.first)){
            this.last.setRight(p.getRight());
            p.getRight().setLeft(this.last);
            this.first = p.getRight();
        }else if(p.equals(this.last)){
            p.getLeft().setRight(this.first);
            this.first.setLeft(p.getLeft());
            this.last = p.getLeft();
        }else {
            p.getLeft().setRight(p.getRight());
            p.getRight().setLeft(p.getLeft());
        }
        this.count --;
    }

}
