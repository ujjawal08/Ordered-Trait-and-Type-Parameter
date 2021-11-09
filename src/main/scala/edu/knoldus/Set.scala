package edu.knoldus

trait Set[a] {
  def incl(x: a): Set[a]
  def contains(x: a): Boolean

}
