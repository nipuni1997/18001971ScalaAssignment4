object decrypte {
  def main(args: Array[String]): Unit = {

    println("Enter Encrypted Code")
    val text = readLine()
    println("Enter key")
    val key = readInt()
    val shift=26-key
    val result = new StringBuffer
    for (i <- 0 until text.length) {
      if (Character.isUpperCase(text.charAt(i))) {
        val ch = ((text.charAt(i).toInt + shift - 65) % 26 + 65).toChar
        result.append(ch)
      }
      else {
        val ch = ((text.charAt(i).toInt + shift - 97) % 26 + 97).toChar
        result.append(ch)
      }
    }
    println("Decrypted code \n"+result)
  }

}
