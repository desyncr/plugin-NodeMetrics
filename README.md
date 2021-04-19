# Freenet Metrics

This is an experimental plugin for Freenet. It tracks various metrics and push them to a local running Graphite instance.

 [![Screenshot 1][screen1thumb]][screen1]

## Graphite

The plugins push metrics to 127.0.0.1:2003 (default).

Run a local Grafana and Graphite instances with Docker using the docker-compose.yml in the repo. Run as:

```
 $ docker-compose up
```

Your Grafana instance should be accessible through http://localhost:3000. Default access: admin/admin.

Import the dashboard from the one in the repo: Freenet-dashboard.json.

# Install

Install this plugin following these steps:

1) Download jar from the releases page
2) Go to http://127.0.0.1:8888/plugins/
3) Go to Add an Unofficial Plugin
4) Add full path to the downloaded jar, and click load

Your dashboard should start load new metrics.

# License

The project is licensed under the [GNU GPL v3][2] license.

  [2]: http://www.gnu.org/licenses/gpl.html
  [screen1]: Dashboard.png
  [screen1thumb]:  Dashboard.png
