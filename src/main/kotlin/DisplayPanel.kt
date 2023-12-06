import java.awt.*
import javax.swing.*

class DisplayPanel(
    private val pass: Password,

) : JPanel(){

    init{
        border = BorderFactory.createEtchedBorder()
    }

    override fun paint(g: Graphics) {

        g.font = Font("American Typewriter", Font.BOLD, 24)


    }

}