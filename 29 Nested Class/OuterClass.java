package nestedClass;

public class OuterClass {
    static int outer_x = 10;
    private static int private_outer_x = 10;
    
    public int public_outer_y = 20;
    protected int protected_outer_y = 20;
    int outer_y = 20;
    private int private_outer_y = 20;
    
    public InnerClass getInner() {
    	return new InnerClass();
    }
    
    // 1. Member Inner Class
    class InnerClass {
    	// static int inner_x = 10;
        // private static int private_inner_x = 10;
        
        public int public_inner_y = 20;
        protected int protected_inner_y = 20;
        int inner_y = 20;
        private int private_inner_y = 20;
        
        public void func() {
        	System.out.println(outer_x);
        	System.out.println(private_outer_x);
        	System.out.println(public_outer_y);
        	System.out.println(protected_outer_y);
        	System.out.println(outer_y);
        	System.out.println(private_outer_y);
        }
    }
    
    // 2. Static Inner Class
    static class StaticInnerClass {
    	static int inner_x = 10;
        private static int private_inner_x = 10;
        
        public int public_inner_y = 20;
        protected int protected_inner_y = 20;
        int inner_y = 20;
        private int private_inner_y = 20;
        
        public void func() {
        	System.out.println(outer_x);
        	System.out.println(private_outer_x);
        	// System.out.println(public_outer_y);
        	// System.out.println(protected_outer_y);
        	// System.out.println(outer_y);
        	// System.out.println(private_outer_y);
        }
    }

}
