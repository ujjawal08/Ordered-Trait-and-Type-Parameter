package edu.knoldus

case class Answer(elem:Int) extends Ordered[Answer]{
  def compare(that: Answer): Int=
    if(this.elem < that.elem) -1
    else if (this.elem > that.elem) 1
    else 0



}
