package com.assignemt.obvious.model


class Data {

    private var copyright: String? = null
    private var date: String? = null
    private var explanation: String? = null
    private var hdurl: String? = null
    private var mediaType: String? = null
    private var serviceVersion: String? = null
    private var title: String? = null
    private var url: String? = null

    fun getCopyright(): String? {
        return copyright
    }

    fun setCopyright(copyright: String?) {
        this.copyright = copyright
    }

    fun getDate(): String? {
        return date
    }

    fun setDate(date: String?) {
        this.date = date
    }

    fun getExplanation(): String? {
        return explanation
    }

    fun setExplanation(explanation: String?) {
        this.explanation = explanation
    }

    fun getHdurl(): String? {
        return hdurl
    }

    fun setHdurl(hdurl: String?) {
        this.hdurl = hdurl
    }

    fun getMediaType(): String? {
        return mediaType
    }

    fun setMediaType(mediaType: String?) {
        this.mediaType = mediaType
    }

    fun getServiceVersion(): String? {
        return serviceVersion
    }

    fun setServiceVersion(serviceVersion: String?) {
        this.serviceVersion = serviceVersion
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }
}