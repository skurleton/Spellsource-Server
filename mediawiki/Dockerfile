FROM mediawiki:1.32.0

RUN apt-get update && apt-get install -y --no-install-recommends \
        git \
		bzip2 \
		unzip \
		xz-utils \
	&& rm -rf /var/lib/apt/lists/*

RUN curl -sS https://getcomposer.org/installer | php && \
     mv composer.phar /usr/bin/composer && \
     chmod +x /usr/bin/composer

RUN git clone --depth 1 -b v0.10.0 \
      https://github.com/edwardspec/mediawiki-aws-s3.git \
      /var/www/html/extensions/AWS \
      && cd /var/www/html/extensions/AWS \
      && /usr/bin/composer install \
      && cd /var/www/html

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/BetaFeatures.git \
      /var/www/html/extensions/BetaFeatures

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/TemplateData.git \
      /var/www/html/extensions/TemplateData

RUN git clone -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/VisualEditor.git \
      /var/www/html/extensions/VisualEditor \
      && cd /var/www/html/extensions/VisualEditor \
      && git submodule update --init \
      && cd /var/www/html

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/MobileFrontend.git \
      /var/www/html/extensions/MobileFrontend

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/skins/MinervaNeue.git \
      /var/www/html/skins/MinervaNeue

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/UploadWizard.git \
      /var/www/html/extensions/UploadWizard

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/UserMerge.git \
      /var/www/html/extensions/UserMerge

RUN git clone --depth 1 -b $MEDIAWIKI_BRANCH \
      https://gerrit.wikimedia.org/r/p/mediawiki/extensions/SmiteSpam.git \
      /var/www/html/extensions/SmiteSpam

ENV MEDIAWIKI_AWS_REGION=us-east-2
ENV MEDIAWIKI_AWS_BUCKET_ID=minionate
ENV MEDIAWIKI_PARSOID_URL=http://localhost:8000
ENV MEDIAWIKI_PARSOID_DOMAIN=http://localhost
ENV MEDIAWIKI_DB_TYPE=mysql
ENV MEDIAWIKI_DB_SERVER=mysqldb
ENV MEDIAWIKI_DB_NAME=mediawiki
ENV MEDIAWIKI_DB_USER=wikiuser
ENV MEDIAWIKI_DB_PASSWORD=password
ENV GOOGLE_RECAPTCHA_SITE_KEY=sitekey
ENV GOOGLE_RECAPTCHA_SECRET_KEY=secretkey

COPY php.ini /usr/local/etc/php/php.ini
COPY LocalSettings.php /var/www/html/LocalSettings.php