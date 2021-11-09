package edu.knoldus

class NonEmptySet[a <: Ordered[a]]
(elem:a, left: Set[a], right: Set[a]) extends Set[a] {
  def contains(x: a): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true;
  def incl(x: a): Set[a] =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

}
