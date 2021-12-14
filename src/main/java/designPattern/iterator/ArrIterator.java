package designPattern.iterator;

public class ArrIterator<T> implements Iterator{
    private ArrContainer<T> container;
    private int pos;

    public ArrIterator(ArrContainer<T> container) {
        this.container = container;
        this.pos = -1;
    }

    @Override
    public Boolean hasNext() {
        if (this.pos < this.container.list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public T nextVal() {
        if (this.hasNext()) {
            this.pos++;
            return this.container.list.get(this.pos);
        }
        return null;
    }
}
