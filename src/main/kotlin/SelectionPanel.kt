import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class SelectionPanel(
    private val pass: Password,
    private val displayPanel: DisplayPanel
) : JPanel(){

    init {
        border = BorderFactory.createTitledBorder("Options")
        layout = FlowLayout()

    }
}


