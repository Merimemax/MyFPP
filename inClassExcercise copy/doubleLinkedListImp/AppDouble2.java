package doubleLinkedListImp;

public class AppDouble2 {

	public static void main(String[] args) {
		DoubleLinkedListImp2<String> dlist = new DoubleLinkedListImp2<>();
		System.out.println("true is expected; " + dlist.isEmpty());
		System.out.println("0 size is expected: " + dlist.size());

		dlist.insert("merih", 0);
		dlist.print();
		System.out.println("\n\n----insert hirem at pos 1--------");
		dlist.insert("hirem", 1);
		dlist.print();
		System.out.println("\n\n-----delete pos 0-------");
		dlist.delete(0);
		dlist.print();
		System.out.println("\n\n------get value(hirem) at pos ------");
		dlist.getValue(0);
		dlist.print();

	}

}
