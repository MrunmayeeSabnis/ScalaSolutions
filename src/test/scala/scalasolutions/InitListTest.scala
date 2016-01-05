package scalasolutions

import org.scalatest.{Matchers, FunSpec}

class InitListTest extends FunSpec with Matchers{

  describe("Init List"){
    it("should give the list except the last element"){
      val initList = new InitList
      initList.init(List('a', 'b', 'c', 'd')) should be(List('a', 'b', 'c'))
    }
  }

}
