package com.amity.socialcloud.uikit.common.model

/**
 * enum class to hold event types
 * @author sumitlakra
 * @date 06/01/2020
 */
enum class AmityEventIdentifier {
    SEARCH_STRING_CHANGED,
    MESSAGE_LONG_PRESS,
    CAMERA_CLICKED,
    PICK_IMAGE,
    PICK_FILE,
    EDIT_MESSAGE,
    DELETE_MESSAGE,
    REPORT_MESSAGE,
    UNREPORT_MESSAGE,
    FAILED_MESSAGE,
    MSG_SEND_ERROR,
    MSG_SEND_SUCCESS,
    DISMISS_POPUP,
    EXPLORE_COMMUNITY,
    SHOW_COMMENT_ACTION_BY_COMMENT_OWNER,
    SHOW_FEED_ACTION_BY_FEED_OWNER,
    SHOW_FEED_ACTION_BY_ADMIN,
    SHOW_FEED_ACTION_BY_OTHER_USER,
    EMPTY_GLOBAL_FEED,
    EMPTY_MY_COMMUNITY,
    UPLOAD_NEXT_IMAGE,
    FAILED_TO_UPLOAD_IMAGE,
    FILE_UPLOAD_MAX_LIMIT_EXCEED,
    FAILED_TO_UPLOAD_FILES,
    CREATE_POST_IMAGE_REMOVED,
    PROFILE_PICTURE_UPLOAD_FAILED,
    PROFILE_PICTURE_UPLOAD_SUCCESS,
    EDIT_PROFILE,
    SEND_MESSAGE,
    MODERATOR_MESSAGE,
    TOGGLE_CHAT_COMPOSE_BAR,
    SHOW_COMMENT_ACTION_BY_OTHER_USER,
    SHOW_COMMENT_ACTION_BY_ADMIN,
    SHOW_AUDIO_RECORD_UI,
    AUDIO_PLAYER_PLAY_CLICKED,
    SET_AUDIO_FILE_PROPERTIES,
    MESSAGE_DELETE_SUCCESS,
    SHOW_SHARE_OPTIONS,
    SEARCH_COMMUNITY,
    SEARCH_USERS
}