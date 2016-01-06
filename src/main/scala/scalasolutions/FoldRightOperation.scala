package scalasolutions


class FoldRightOperation {

  def foldRight[A, B](list: List[A], emptyListValue: B)(f: (A, B) => B): B = list match {
    case Nil => emptyListValue
    case head :: tail => f(head, foldRight(tail, emptyListValue)(f))
  }

}
