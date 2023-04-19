package byItAcademy.Lesson_14.Lesson;

public class Train implements AbstractTrain {
    private Integer numbers;
    private String route;
    private Integer distance;
    private Status status;
    private Integer fuel;
    private Integer expenditureFuel;
    private Load load;

    public Train(Integer numbers, String route, Integer distance, Integer volumeFuel, Integer expenditureFuel) {
        this.numbers = numbers;
        this.route = route;
        this.distance = distance;
        this.fuel = volumeFuel;
        this.expenditureFuel = expenditureFuel;
        this.load = Load.NotLoad;
        this.status = Status.UnLoaded;
    }

    @Override
    public void refillFuel(Integer fuel) {
        this.fuel += fuel;
    }

    @Override
    public void departure() {
        if (fuel * expenditureFuel < distance) {
            throw new MyExceptions("Меньше топлива чем нужно");
        }
        if (status != Status.Loading) {
            throw new MyExceptions("Поезд нужно загрузить -_-");
        }
        System.out.println("Поезд в пути");
        status = Status.Way;
    }

    @Override
    public void changeStatus() {
        if (load == Load.Load) {
            status = Status.UnLoaded;
        } else {
            status = Status.Loading;
        }
        System.out.println("Поезд приехал");
    }

    @Override
    public void unloading() {
        if (status == Status.Way) {
            throw new MyExceptions("Поезд в пути");
        }
        if (load == Load.NotLoad) {
            throw new MyExceptions("Поезд пуст нечего разгружать");
        }
        System.out.println("Поезд разгружен");
        load = Load.NotLoad;
    }

    @Override
    public void loading() {
        if (status == Status.Way) {
            throw new MyExceptions("Поезд в пути");
        }
        if (load == Load.Load) {
            throw new MyExceptions("Поезд полн");
        }
        System.out.println("Поезд загружен");
        status = Status.Loading;
        load = Load.Load;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getExpenditureFuel() {
        return expenditureFuel;
    }

    public void setExpenditureFuel(Integer expenditureFuel) {
        this.expenditureFuel = expenditureFuel;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numbers=" + numbers +
                ", route='" + route + '\'' +
                ", distance='" + distance + '\'' +
                ", status='" + status + '\'' +
                ", volumeFuel=" + fuel +
                ", expenditureFuel=" + expenditureFuel +
                ", load=" + load +
                '}';
    }
}
