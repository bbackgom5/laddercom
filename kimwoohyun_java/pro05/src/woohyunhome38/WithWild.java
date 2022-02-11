package woohyunhome38;

public class WithWild<T extends Number> {
		T data;
		WithWild (T d) {data = d;}
		boolean same(WithWild<?> x) {
			if (Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue()))
					return true;
			return false;
		
		}
}
