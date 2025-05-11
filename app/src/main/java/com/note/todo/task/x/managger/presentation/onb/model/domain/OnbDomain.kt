package com.note.todo.task.x.managger.presentation.onb.model.domain

import com.note.todo.task.x.managger.R

data class OnbDomain(
    var id: Long = 0L,
    var imgRes: Int = 0,
    var titleRes: Int = 0,
    var desRes: Int = 0,
) {
    companion object {
        fun getListOnboardings() = listOf(
            OnbDomain(0L, R.drawable.img_onb_1, R.string.title_onb_1, R.string.des_onb_1),
            OnbDomain(1L, R.drawable.img_onb_2, R.string.title_onb_2, R.string.des_onb_2),
            OnbDomain(2L, R.drawable.img_onb_3, R.string.title_onb_3, R.string.des_onb_3),
        )
    }

    fun isLastItem() =
        this.id == getListOnboardings()[getListOnboardings().size - 1].id
}