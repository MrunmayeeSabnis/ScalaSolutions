package scalasolutions


class FoldRightOperation {

  def foldRight[A, B](list: List[A], emptyListValue: B)(f: (A, B) => B): B = list match {
    case Nil => emptyListValue
    case head :: tail => f(head, foldRight(tail, emptyListValue)(f))
  }

  def product[A](list: List[Int]) = foldRight(list, 1)((x, y) => ifZero(x) * y)

  private def ifZero(x: Int) = if(x == 0) 0 else x
}
