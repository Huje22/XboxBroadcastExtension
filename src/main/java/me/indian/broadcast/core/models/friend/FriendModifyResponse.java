package me.indian.broadcast.core.models.friend;

public record FriendModifyResponse(
    int code,
    String description,
    String source,
    Object traceInformation
) {
}
