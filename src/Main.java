public class Main {
    public static void main(String[] args) {

        CatalogWorkers workers = new CatalogWorkers();
        Worker worker1 = new Worker(1, "9287546557", "Jhon", 20);
        workers.add(worker1);
        workers.add(new Worker(2, "9584563221", "Bill", 10));
        workers.add(new Worker(3, "9856452123", "Bill", 5));
        workers.add(new Worker(4, "635412365", "Anna", 2));
        System.out.println(workers.findWorkerByExperience(5));
        System.out.println(workers.findWorkerByName("Anna"));
        System.out.println(workers.findWorkerById(2));
    }
}