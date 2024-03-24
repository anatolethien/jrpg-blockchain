package eu.anatolethien.blockchain

import java.security.MessageDigest

/**
  * Implementation of a block in the blockchain. A block is a hash of
  * concatenation of the previous block's hash and the transaction data
  * @param previousBlockHash the hash of the previous block in the blockchain
  * @param transaction the transaction data to be stored in this block
  */
class Block(val previousBlockHash: String, val transaction: Transaction) {

  private val data = List[Transaction | String](transaction, previousBlockHash).mkString("\n")

  private val md = MessageDigest.getInstance("SHA-256")
  private val bytes = md.digest(data.getBytes("UTF-8"))
  val hash = bytes.map(byte => String.format("%02x", byte.asInstanceOf[Object])).mkString

}
