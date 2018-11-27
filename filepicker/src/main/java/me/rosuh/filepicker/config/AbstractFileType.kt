package me.rosuh.filepicker.config

import me.rosuh.filepicker.bean.FileItemBean

/**
 *
 * @author rosu
 * @date 2018/11/27
 */
abstract class AbstractFileType {
    /**
     * 自定义文件类型识别方法，传入 @param itemBean 条目数据对象，
     * 由实现者来实现文件类型的甄别，返回填充了 fileType 的方法
     */
    abstract fun fillFileType(itemBean: FileItemBean): FileItemBean
}