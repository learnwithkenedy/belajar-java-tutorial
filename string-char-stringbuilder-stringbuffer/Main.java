public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuidler = new StringBuilder();

        Runnable task = () -> {
            for(int i = 0; i < 2000; i++) {
                stringBuidler.append("i");
            }
        };

        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);
        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (Exception e) {}

        System.out.println("StringBuilder (Not Synchronized)");
        System.out.println("Length : " + stringBuidler.length());

        StringBuffer stringBuffer = new StringBuffer();
        Runnable task2 = () -> {
            for(int i = 0; i < 2000; i++) {
                stringBuffer.append("i");
            }
        };

        Thread threadx = new Thread(task2);
        Thread threadx2 = new Thread(task2);
        threadx.start();
        threadx2.start();

        try {
            threadx.join();
            threadx2.join();
        } catch (Exception e) {}

        System.out.println("StringBuffer (Synchronized)");
        System.out.println("Length : " + stringBuffer.length());

    }    
}
