package fr.umlv.data;

class LinkedLink<T> {

  private Link first;
  private int length;

  public LinkedLink() {
    this.first = null;
  }

  public void add(T value) {
    this.first = new Link(value, this.first);;
    this.length++;
  }

  public T get(int index) {
    if (index > length || index < 0) {
      throw new IllegalArgumentException("Index out of range");
    }
    Link cursor = this.first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return (T) cursor.value;
  }

  public boolean contains(Object o) {
    Link cursor = this.first;
    while (cursor != null) {
      if (o.equals(cursor.value)) {
        return true;
      }
      cursor = cursor.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    Link cursor = this.first;
    while (cursor != null) {
      str.append(cursor.value);
      str.append(" ");
      cursor = cursor.next;
    }
    return str.toString();
  }

}
