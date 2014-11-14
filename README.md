sbt-middleman
====================

Attempt at using middleman in sbt

Execute `./sbt` and within the sbt shell, execute:
`gemExec bundle install`
`gemExec middleman build`

The second step is successful in a Linux environment.  
It fails in a Windows environment: 

```text
> gemExec middleman build
[warn] There may be incompatibilities among your library dependencies.
[warn] Here are some of the libraries that were evicted:
[warn]  * rubygems:chunky_png:[1.2,1.99999] -> 1.3.2
[warn]  * rubygems:ffi:[0,) -> 1.9.3
[warn]  * rubygems:activesupport:([3.1,), [4.1.0,4.1.99999]) -> 4.1.7
[warn]  * rubygems:tilt:([1.4.1,1.4.99999], [1.4.1,2.0)) -> 1.4.1
[warn]  * rubygems:sass:([3.3.0,3.5), [3.3.13,3.5), [3.2,3.5), [3.4.0,4.0)) -> 3.4.6
[warn]  * rubygems:minitest:[5.1,5.99999] -> 5.4.3
[warn] Run 'evicted' to see detailed eviction warnings
[info] Using target/rubygems/cache/jruby-pageant-1.1.1-java.gem
[info] Using target/rubygems/cache/middleman-3.3.7.gem
[info] Using target/rubygems/cache/middleman-core-3.3.7.gem
[info] Using target/rubygems/cache/bundler-1.7.6.gem
[info] Using target/rubygems/cache/rack-1.5.2.gem
[info] Using target/rubygems/cache/erubis-2.7.0.gem
[info] Using target/rubygems/cache/hooks-0.4.0.gem
[info] Using target/rubygems/cache/uber-0.0.11.gem
[info] Using target/rubygems/cache/rack-test-0.6.2.gem
[info] Using target/rubygems/cache/thor-0.19.1.gem
[info] Using target/rubygems/cache/padrino-helpers-0.12.4.gem
[info] Using target/rubygems/cache/padrino-support-0.12.4.gem
[info] Using target/rubygems/cache/listen-2.7.12.gem
[info] Using target/rubygems/cache/celluloid-0.16.0.gem
[info] Using target/rubygems/cache/timers-4.0.1.gem
[info] Using target/rubygems/cache/hitimes-1.2.2-java.gem
[info] Using target/rubygems/cache/rb-fsevent-0.9.4.gem
[info] Using target/rubygems/cache/rb-inotify-0.9.5.gem
[info] Using target/rubygems/cache/i18n-0.6.11.gem
[info] Using target/rubygems/cache/middleman-sprockets-3.3.10.gem
[info] Using target/rubygems/cache/sprockets-2.12.3.gem
[info] Using target/rubygems/cache/hike-1.2.3.gem
[info] Using target/rubygems/cache/multi_json-1.10.1.gem
[info] Using target/rubygems/cache/tilt-1.4.1.gem
[info] Using target/rubygems/cache/sprockets-sass-1.2.0.gem
[info] Using target/rubygems/cache/sprockets-helpers-1.1.0.gem
[info] Using target/rubygems/cache/haml-4.0.5.gem
[info] Using target/rubygems/cache/tilt-2.0.1.gem
[info] Using target/rubygems/cache/compass-import-once-1.0.5.gem
[info] Using target/rubygems/cache/compass-1.0.1.gem
[info] Using target/rubygems/cache/compass-core-1.0.1.gem
[info] Using target/rubygems/cache/uglifier-2.5.3.gem
[info] Using target/rubygems/cache/json-1.8.1-java.gem
[info] Using target/rubygems/cache/coffee-script-2.3.0.gem
[info] Using target/rubygems/cache/coffee-script-source-1.8.0.gem
[info] Using target/rubygems/cache/execjs-2.2.2.gem
[info] Using target/rubygems/cache/kramdown-1.5.0.gem
[info] Using target/rubygems/cache/ffi-1.9.3-java.gem
[info] Using target/rubygems/cache/jquery-middleman-3.0.4.gem
[info] Using target/rubygems/cache/middleman-blog-3.5.3.gem
[info] Using target/rubygems/cache/tzinfo-1.2.2.gem
[info] Using target/rubygems/cache/thread_safe-0.3.4-java.gem
[info] Using target/rubygems/cache/addressable-2.3.6.gem
[info] Using target/rubygems/cache/middleman-s3_sync-3.0.35.gem
[info] Using target/rubygems/cache/unf-0.1.4-java.gem
[info] Using target/rubygems/cache/fog-1.24.0.gem
[info] Using target/rubygems/cache/fog-core-1.24.0.gem
[info] Using target/rubygems/cache/builder-3.2.2.gem
[info] Using target/rubygems/cache/excon-0.41.0.gem
[info] Using target/rubygems/cache/formatador-0.2.5.gem
[info] Using target/rubygems/cache/mime-types-2.4.3.gem
[info] Using target/rubygems/cache/net-scp-1.2.1.gem
[info] Using target/rubygems/cache/net-ssh-2.9.1.gem
[info] Using target/rubygems/cache/fog-json-1.0.0.gem
[info] Using target/rubygems/cache/nokogiri-1.6.4.1-java.gem
[info] Using target/rubygems/cache/ipaddress-0.8.0.gem
[info] Using target/rubygems/cache/fog-brightbox-0.6.1.gem
[info] Using target/rubygems/cache/inflecto-0.0.2.gem
[info] Using target/rubygems/cache/fog-softlayer-0.3.24.gem
[info] Using target/rubygems/cache/fog-sakuracloud-0.1.1.gem
[info] Using target/rubygems/cache/fog-radosgw-0.0.3.gem
[info] Using target/rubygems/cache/fog-xml-0.1.1.gem
[info] Using target/rubygems/cache/map-6.5.5.gem
[info] Using target/rubygems/cache/pmap-1.0.1.gem
[info] Using target/rubygems/cache/ruby-progressbar-1.7.0.gem
[info] Using target/rubygems/cache/colorize-0.7.3.gem
[info] Using target/rubygems/cache/middleman-cloudfront-0.1.0.gem
[info] Using target/rubygems/cache/middleman-autoprefixer-2.2.4.gem
[info] Using target/rubygems/cache/autoprefixer-rails-4.0.0.gem
[info] Using target/rubygems/cache/middleman-s3_redirect-3.0.5.gem
[info] Using target/rubygems/cache/parallel-1.3.3.gem
[info] Using target/rubygems/cache/dotenv-1.0.2.gem
[info] Using target/rubygems/cache/minitest-5.4.3.gem
[info] Using target/rubygems/cache/activesupport-4.1.7.gem
[info] Using target/rubygems/cache/pry-0.10.1-java.gem
[info] Using target/rubygems/cache/coderay-1.1.0.gem
[info] Using target/rubygems/cache/slop-3.6.0.gem
[info] Using target/rubygems/cache/method_source-0.8.2.gem
[info] Using target/rubygems/cache/spoon-0.0.4.gem
[info] Using target/rubygems/cache/chunky_png-1.3.2.gem
[info] Using target/rubygems/cache/sass-3.4.6.gem
[info] Using target/rubygems/cache/therubyrhino-2.0.4.gem
[info] Using target/rubygems/cache/therubyrhino_jar-1.7.4.gem
WARN: Unresolved specs during Gem::Specification.reset:
      json (>= 1.7.7, ~> 1.7)
      ffi (>= 0.5.0)
WARN: Clearing out unresolved specs.
Please report a bug if this causes problems.
LoadError: no such file to load -- jruby_pageant
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/agent/java_pageant.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/agent.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/agent.rb:20
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/key_manager.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/key_manager.rb:4
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/session.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh/authentication/session.rb:4
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/net-ssh-2.9.1/lib/net/ssh.rb:11
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog/joyent/compute.rb:1
        require at org/jruby/RubyKernel.java:1065
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog/joyent/compute.rb:3
           each at org/jruby/RubyArray.java:1613
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog/joyent.rb:1
           each at org/jruby/RubyArray.java:1613
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog/joyent.rb:1
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog.rb:1
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/fog-1.24.0/lib/fog.rb:40
         (root) at C:/Users/jbarnes/code/sbt-middleman/target/rubygems/gems/middleman-s3_sync-3.0.35/lib/middleman/s3_sync.rb:1
           load at org/jruby/RubyKernel.java:1081
         (root) at /C:/Users/jbarnes/code/sbt-middleman/target/rubygems/bin/middleman:23
  gemExecAction at RubygemsPlugin.scala:69
          apply at RubygemsPlugin.scala:20
          apply at RubygemsPlugin.scala:18
          apply at Function1.scala:47
          apply at TypeFunctions.scala:40
           work at System.scala:63
          apply at Execute.scala:226
          apply at Execute.scala:226
    wideConvert at ErrorHandling.scala:17
           work at Execute.scala:235
          apply at Execute.scala:226
          apply at Execute.scala:226
          apply at ConcurrentRestrictions.scala:159
           call at CompletionService.scala:28
[error] (compile:gemExec) Gem command failed!
[error] Total time: 8 s, completed Nov 14, 2014 3:31:08 PM
>
```