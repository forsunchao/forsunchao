package test;

public class TestCovariant {
	class Number {
        public Number whoAreYou() {return new Number();}
    }
    class Integer extends Number {
        public Integer whoAreYou() {return new Integer();}
    }
    class Float extends Number {
        public Float whoAreYou() {return new Float();}
    }
}
