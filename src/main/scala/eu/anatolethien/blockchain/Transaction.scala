package eu.anatolethien.blockchain

class Transaction(val emitter: Int, val receiver: Int, val amount: Int) {
    override def toString: String = {
        List(emitter, receiver, amount).mkString(",")
    }
}
