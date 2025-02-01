enum class Estado {
    PENDIENTE, COMPLETADA;

    override fun toString(): String {
        return super.toString().lowercase().replaceFirstChar { it.uppercase() }
    }
}