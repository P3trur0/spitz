package io.github.spitz

sealed trait MemberState

case object Alive extends MemberState
case object Suspect extends MemberState
case object Failed extends MemberState
