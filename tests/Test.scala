object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(69, 88, 19, 19, 6)
    assert(Policy.score(signalcase_1) == 54)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(82, 70, 20, 7, 5)
    assert(Policy.score(signalcase_2) == 127)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(97, 75, 14, 10, 11)
    assert(Policy.score(signalcase_3) == 186)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
