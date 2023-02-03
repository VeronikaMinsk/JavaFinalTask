import java.util.HashMap;

public class Final_task {
// Разработать программу, имитирующую поведение коллекции HashSet. Формат данных Integer. 

    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
        add(23);
        add(99);
        add(64);
        add(37); 
        add(1);
        add(50);

        // System.out.println(hMap.keySet());
        System.out.println(getString());
        
    }

//  В программе содать метод add добавляющий элемент
    public static void add(Integer number){
        hMap.put(number, OBJECT);   
	}
    
// и метод позволяющий выводить эллементы коллекции в консоль
	public static String getString(){
        return hMap.keySet().toString();   
	}
}