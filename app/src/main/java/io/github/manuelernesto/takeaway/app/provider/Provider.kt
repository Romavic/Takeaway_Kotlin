package io.github.manuelernesto.takeaway.app.provider

import com.google.firebase.database.*

class Provider {

    private val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()
    val userTable: DatabaseReference = firebaseDatabase.getReference("User")

    fun postData() {
        userTable.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                TODO("Not yet implemented")
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }
}
