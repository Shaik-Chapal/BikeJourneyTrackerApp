package com.project.bikejourneytrackerapp.model.data

data class Image(
    val id: String,
    val resolutions: List<Resolution>,
    val source: Source,
    val variants: Variants
)