package io.github.spitz

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class SpitzTestSpec extends FlatSpec with Matchers {
  
  "Alive" should "be a MemberState" in {
    Alive shouldBe a [MemberState]
  }

  "Suspect" should "be a MemberState" in {
    Suspect shouldBe a [MemberState]
  }

  "Failed" should "be a MemberState" in {
    Failed shouldBe a [MemberState]
  }
  
}