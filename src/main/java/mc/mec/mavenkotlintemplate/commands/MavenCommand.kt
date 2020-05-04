package mc.mec.mavenkotlintemplate.commands

import mc.mec.mavenkotlintemplate.MavenKotlinTemplate
import net.md_5.bungee.api.chat.ClickEvent
import net.md_5.bungee.api.chat.ComponentBuilder
import net.md_5.bungee.api.chat.HoverEvent
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.plugin.Plugin

object MavenCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val pl : MavenKotlinTemplate
        sender.sendMessage("Hello Maven!")
        return true
    }

}