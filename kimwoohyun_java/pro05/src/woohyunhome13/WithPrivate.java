package woohyunhome13;

interface WithPrivate {
	default int getData() {
		print();
		return get()+100;
	}
	private void print() {
		System.out.println(get());
	}
	private int get() {
		return 100;
	}
}
