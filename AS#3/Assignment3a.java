public class Assignment3a {

    public static void main(String[] args) {
        //create a SSD object
        SSD samsungT7 = new SSD("Samsung", "T7", 2, 300);

        System.out.println("-- HardDrive Information --" + "\nMake: " + samsungT7.getMake()
                + "\nModel: " + samsungT7.getModel() + "\nCapacity: " + samsungT7.getCapacity() + "TB" +
                "\nTerabytes Written(TBW): " + samsungT7.getTeraBytesWritten());

    }
}
