/**
 */
package intent.impl;

import intent.Data;
import intent.IntentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link intent.impl.DataImpl#getHost <em>Host</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getPath <em>Path</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getPathPrefix <em>Path Prefix</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getPathPattern <em>Path Pattern</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getPort <em>Port</em>}</li>
 *   <li>{@link intent.impl.DataImpl#getScheme <em>Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends EObjectImpl implements Data {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathPrefix() <em>Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPrefix() <em>Path Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPrefix()
	 * @generated
	 * @ordered
	 */
	protected String pathPrefix = PATH_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathPattern() <em>Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathPattern() <em>Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern()
	 * @generated
	 * @ordered
	 */
	protected String pathPattern = PATH_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return IntentPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathPrefix() {
		return pathPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPrefix(String newPathPrefix) {
		String oldPathPrefix = pathPrefix;
		pathPrefix = newPathPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__PATH_PREFIX, oldPathPrefix, pathPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathPattern() {
		return pathPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPattern(String newPathPattern) {
		String oldPathPattern = pathPattern;
		pathPattern = newPathPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__PATH_PATTERN, oldPathPattern, pathPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntentPackage.DATA__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntentPackage.DATA__HOST:
				return getHost();
			case IntentPackage.DATA__MIME_TYPE:
				return getMimeType();
			case IntentPackage.DATA__PATH:
				return getPath();
			case IntentPackage.DATA__PATH_PREFIX:
				return getPathPrefix();
			case IntentPackage.DATA__PATH_PATTERN:
				return getPathPattern();
			case IntentPackage.DATA__PORT:
				return getPort();
			case IntentPackage.DATA__SCHEME:
				return getScheme();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntentPackage.DATA__HOST:
				setHost((String)newValue);
				return;
			case IntentPackage.DATA__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case IntentPackage.DATA__PATH:
				setPath((String)newValue);
				return;
			case IntentPackage.DATA__PATH_PREFIX:
				setPathPrefix((String)newValue);
				return;
			case IntentPackage.DATA__PATH_PATTERN:
				setPathPattern((String)newValue);
				return;
			case IntentPackage.DATA__PORT:
				setPort((String)newValue);
				return;
			case IntentPackage.DATA__SCHEME:
				setScheme((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntentPackage.DATA__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case IntentPackage.DATA__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case IntentPackage.DATA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case IntentPackage.DATA__PATH_PREFIX:
				setPathPrefix(PATH_PREFIX_EDEFAULT);
				return;
			case IntentPackage.DATA__PATH_PATTERN:
				setPathPattern(PATH_PATTERN_EDEFAULT);
				return;
			case IntentPackage.DATA__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case IntentPackage.DATA__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntentPackage.DATA__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case IntentPackage.DATA__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case IntentPackage.DATA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case IntentPackage.DATA__PATH_PREFIX:
				return PATH_PREFIX_EDEFAULT == null ? pathPrefix != null : !PATH_PREFIX_EDEFAULT.equals(pathPrefix);
			case IntentPackage.DATA__PATH_PATTERN:
				return PATH_PATTERN_EDEFAULT == null ? pathPattern != null : !PATH_PATTERN_EDEFAULT.equals(pathPattern);
			case IntentPackage.DATA__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case IntentPackage.DATA__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (host: ");
		result.append(host);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", path: ");
		result.append(path);
		result.append(", pathPrefix: ");
		result.append(pathPrefix);
		result.append(", pathPattern: ");
		result.append(pathPattern);
		result.append(", port: ");
		result.append(port);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //DataImpl
