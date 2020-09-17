package wanghaixu;

public class test {
    public static void main(String[] args){
        Person p = new Person();
        p.setId(0);
        System.out.println(p.getId());
        Person p2 = new Person();
        System.out.println(p2);

        PersonCircle circle = new PersonCircle(500);
        System.out.println("È¦×Ó´óÐ¡£º" + circle.getCount());

        Person person = circle.getFirst();

        int count = 0;

        while (circle.getCount() > 1){
            count ++;
            if(count == 3){
                circle.delete(person);
                count = 0;
            }
            person = person.getRight();
        }
        System.out.println(circle.getFirst().getId());
    }
}