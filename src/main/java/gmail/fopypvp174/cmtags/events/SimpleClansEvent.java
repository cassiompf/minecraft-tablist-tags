package gmail.fopypvp174.cmtags.events;

import gmail.fopypvp174.cmtags.CmTags;
import net.sacredlabyrinth.phaed.simpleclans.events.CreateClanEvent;
import net.sacredlabyrinth.phaed.simpleclans.events.DisbandClanEvent;
import net.sacredlabyrinth.phaed.simpleclans.events.PlayerJoinedClanEvent;
import net.sacredlabyrinth.phaed.simpleclans.events.PlayerKickedClanEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SimpleClansEvent implements Listener {

    private CmTags cmTags;

    public SimpleClansEvent(CmTags cmTags) {
        this.cmTags = cmTags;
    }

    @Deprecated
    @EventHandler
    public void createClan(CreateClanEvent e) {
        cmTags.atualizarScore();
    }

    @Deprecated
    @EventHandler
    public void disbandClan(DisbandClanEvent e) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(cmTags, () -> cmTags.atualizarScore(), 60L);
    }

    @Deprecated
    @EventHandler
    public void playerKikedClan(PlayerKickedClanEvent e) {
        cmTags.atualizarScore();
    }

    @Deprecated
    @EventHandler
    public void playerJoinClan(PlayerJoinedClanEvent e) {
        cmTags.atualizarScore();
    }

}
