package fr.umlv.data;

import java.util.Objects;

class Link {
  
  Link next;
  final Object value;

  Link(Object value, Link next) {
    this.value = Objects.requireNonNull(value);
    this.next = next;
  }

  Link(Object value) {
    this(value, null);
  }
}
