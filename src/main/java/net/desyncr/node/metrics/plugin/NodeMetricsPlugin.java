package net.desyncr.node.metrics.plugin;

import freenet.node.*;
import freenet.pluginmanager.*;
import freenet.support.*;
import net.desyncr.node.metrics.*;

public class NodeMetricsPlugin implements FredPlugin, FredPluginThreadless {
    private PluginRespirator pr;

    static {
        Logger.registerClass(NodeMetricsPlugin.class);
    }

    public NodeMetricsPlugin() {
        Logger.error(this, "NodeMetricsPlugin instantiated");
    }

    @Override
    public void terminate() {

    }

    @Override
    public void runPlugin(PluginRespirator pluginRespirator) {
        Logger.error(this, "NodeMetricsPlugin started");
        this.pr = pluginRespirator;
        Node node = pr.getNode();
        new DefaultNodeMetrics(node).start();
        Logger.error(this, "Just started default node metrics");
    }
}
