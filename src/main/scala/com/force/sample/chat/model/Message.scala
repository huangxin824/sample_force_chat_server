package com.force.sample.chat.model

import javax.persistence._

@Entity
class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: String = ""
  @Column(nullable = false)
  var message: String = ""
  @Column(nullable = false)
  var user: String = ""
  @Column(nullable = false)
  var created: Long = _
  @Column(name="chatRoom")
  @ManyToOne
  var chatRoom: ChatRoom = _

}