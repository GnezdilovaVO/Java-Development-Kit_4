import java.util.ArrayList;
import java.util.List;

public class CatalogWorkers {
    private List<Worker> catWorkers;
    public CatalogWorkers() {
        catWorkers = new ArrayList<>();
    }
    public CatalogWorkers(List<Worker> catWorkers) {
        this.catWorkers = catWorkers;
    }
    public void add(Worker worker) {
        catWorkers.add(worker);
    }
    public List<Worker> findWorkerByExperience(int experience) {
        return catWorkers.stream().filter(w -> w.getExperience() == experience).toList();
    }

    public StringBuilder findWorkerByName(String name) {
        StringBuilder sb = new StringBuilder();
        catWorkers.stream().filter(w -> w.getName().equals(name)).forEach(w -> sb.append(w.getPhoneNumber()));
        return sb;
    }
    public List<Worker> findWorkerById(int id){
        return catWorkers.stream().filter(w -> w.getId() == id).toList();
    }

}
