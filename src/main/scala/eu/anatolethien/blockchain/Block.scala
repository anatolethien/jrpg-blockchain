package eu.anatolethien.blockchain

import java.security.MessageDigest

class Block(val previousBlockHash: String, val transaction: Transaction) {
    // Concatenation of previousBlockHash and transaction data
    val data = List(transaction, previousBlockHash).mkString("\n")
    // New block hash
    val md = MessageDigest.getInstance("SHA-256")
    val bytes = md.digest(data.getBytes("UTF-8"))
    val hash = bytes.map(byte => String.format("%02x", byte.asInstanceOf[Object])).mkString
}
