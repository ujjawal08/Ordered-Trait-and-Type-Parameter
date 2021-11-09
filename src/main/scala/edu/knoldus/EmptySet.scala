package edu.knoldus

class EmptySet[a <: Ordered[a]] extends Set [a]{
  def contains(x: a): Boolean = false

  def incl(x: a): Set[a] = new NonEmptySet(x, new EmptySet[a], new EmptySet[a])
}

